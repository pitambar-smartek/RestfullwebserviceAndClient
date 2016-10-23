package com.yash.provider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

@Path("/download")
public class FileDownloadService {

	@GET
	@Path("/jpg")
	public Response downloadPdfFile() {
		StreamingOutput fileStream = new StreamingOutput() {
			@Override
			public void write(java.io.OutputStream output) throws IOException,
					WebApplicationException {
				try {
					java.nio.file.Path path = Paths
							.get("D:/MOVIE_SONGS_PICTURE/Ganesh puja & Konark/Image2278.jpg");
					byte[] data = Files.readAllBytes(path);
					output.write(data);
					output.flush();
				} catch (Exception e) {
					throw new WebApplicationException("File Not Found !!");
				}
			}
		};
		return Response
				.ok(fileStream, MediaType.APPLICATION_OCTET_STREAM)
				.header("content-disposition",
						"attachment; filename = myfile.jpg").build();
	}
}
