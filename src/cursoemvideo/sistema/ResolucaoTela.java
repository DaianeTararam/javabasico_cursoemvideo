package cursoemvideo.sistema;

import java.awt.*;


public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension dimensao = resolucao.getScreenSize();
        System.out.println("A resolução da tela é: " +
                dimensao.width + "x" + dimensao.height + " pixels");
    }
}
