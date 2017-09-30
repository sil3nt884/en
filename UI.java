import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings({ "serial", "unused" })
public class UI extends JFrame {

	public UI () {
	
	}
	
	public static void main(String[] args) {
		 FileEncryptor file = new  FileEncryptor(new File("C:\\Users\\Ricky\\Desktop\\test.txt2"));
		 try {
			byte [] data = file.Dencrypt("J${`^wO\"a )5VmM;<dF>!CgmHj-0uOA8[5:4^2BGdh'\\A.==rWS5>HoKO}Nx\"hx{/JzZ.8,)`,90oF;}( @1qZ!2%O%G80\"GdB.Q6.,|hPNI-Vw^b09W=edn<H3v'*+M^%3n|!0ih5zP9&5&^x,ON;O46(1IXcH:M=`=@<t<W8Y<I=w>:>BAy4TQ%%\"0oYd?&wc+*)!ucIa=A6FxVDD.t+5?12(pUdx1R+RD<Y<?0_k{m#L>8v@6IdTt%&LBP$x4J${`^wO\"a )5VmM;<dF>!CgmHj-0uOA8[5:4^2BGdh'\\A.==rWS5>HoKO}Nx\"hx{/JzZ.8,)`,90oF;}( @1qZ!2%O%G80\"GdB.Q6.,|hPNI-Vw^b09W=edn<H3v'*+M^%3n|!0ih5zP9&5&^x,ON;O46(1IXcH:M=`=@<t<W8Y<I=w>:>BAy4TQ%%\"0oYd?&wc+*)!ucIa=A6FxVDD.t+5?12(pUdx1R+RD<Y<?0_k{m#L>8v@6IdTt%&LBP$x4");
			file.writeFile(data);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}
