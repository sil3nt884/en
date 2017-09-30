import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

@SuppressWarnings("unused")
public class FileEncryptor {
		
	private File  file;
	
	public  FileEncryptor(File file) {
		this.setFile(file);
	}
	
	public byte [] Encrypt() throws IOException {
		//this shit is hot.
		Encoder base = Base64.getEncoder();
		Path path = Paths.get(file.getAbsolutePath());
		byte[] data = Files.readAllBytes(path);
		byte [] encoded = base.encode(data);
		for(int i=0; i<encoded.length; i++) {
			encoded[i]+=(byte) 256;
		}
		byte [] doubleEncoded = base.encode(encoded);
		return doubleEncoded;
	}
	
	public byte [] Dencrypt() throws IOException {
	Decoder decoded = Base64.getDecoder();
	Path path = Paths.get(file.getAbsolutePath());
	byte[] data = Files.readAllBytes(path);
	byte [] encoded = decoded.decode(data);	
	for(int i=0; i<encoded.length; i++) {
		encoded[i]-=(byte) 256 ;
	}
	byte [] doubledecoded = decoded.decode(encoded);
	return doubledecoded;
	
	}
	
	
	public void writeFile(byte [] data) throws IOException {
		Files.write(Paths.get(file.getAbsolutePath()+"2"), data, StandardOpenOption.CREATE_NEW);
	
	}
	

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	

}
