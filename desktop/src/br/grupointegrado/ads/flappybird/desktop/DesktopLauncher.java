package br.grupointegrado.ads.flappybird.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import br.grupointegrado.ads.flappybird.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = 600; // definindo a aultura e largura da execu��o Desktop
		config.width = 480;
		new LwjglApplication(new MainGame(), config);
	}
}
