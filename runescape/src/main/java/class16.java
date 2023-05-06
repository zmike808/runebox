import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class class16 extends SSLSocketFactory {
	SecureRandom field83;

	static {
		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}

	}

	public class16() {
		this.field83 = new SecureRandom();
	}

	@Override
	public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
		return null;
	}

	@Override
	public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException, UnknownHostException {
		return null;
	}

	@Override
	public Socket createSocket(InetAddress host, int port) throws IOException {
		return null;
	}

	@Override
	public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
		return null;
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (null == var1) {
			var1 = new Socket();
		}

		if (!var1.isConnected()) {
			var1.connect(new InetSocketAddress(var2, var3));
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field83);
		return this.method209(var2, var5);
	}

	public String[] getDefaultCipherSuites() {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	SSLSocket method209(String var1, TlsClientProtocol var2) {
		return new class13(this, var2, var1);
	}
}
