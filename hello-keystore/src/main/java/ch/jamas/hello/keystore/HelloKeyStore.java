package ch.jamas.hello.keystore;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Enumeration;

import com.sun.java.util.jar.pack.Package.File;

public class HelloKeyStore {

	public static void main(String[] args) {
		try {
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
			Path keyFile = Paths.get(".keystore");
			keyStore.load(new InputStream(keyFile.toFile()), "dev_ssl");
			Enumeration<String> aliases = keyStore.aliases();
			while(aliases.hasMoreElements()) {
				String alias = aliases.nextElement();
				System.out.println(alias);
			}
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
