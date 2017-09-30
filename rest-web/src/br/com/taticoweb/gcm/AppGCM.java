package br.com.taticoweb.gcm;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.taticoweb.entity.Content;
import br.com.taticoweb.util.Post2GCM;

public class AppGCM {
	
	public static final String API_KEY = "AIzaSyA2PfbnDb5H_TteX_uIsjgr4dgj-gn6-U8";
	
	public static void main(String[] args) {
		System.out.println("Enviando POST para o GCM");
		
		Post2GCM.post(API_KEY, criarContent());
	}
	
	private static Content criarContent() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Content content = new Content();
		content.addRegId("cWncx_lTp8g:APA91bEGC4hrTW2o1IrCNnjwIrwJ5_ymr4X1SnzMXF3SI9jCUlH7pi09Hl5fXyNbNz86GxUucv69wXf_3GiMgm8yCdCqrC2QWpo63jTDHPj27R3BX76wRCiFj16l91gTpce9BwScdV3d");
		content.addData("titulo", "Titulo Teste");
		content.addData("message", "Message Teste");
		content.addData("data", dateFormat.format(new Date()));
		content.addData("id", "2");
		content.addData("imgUrl", "http://files.ctctcdn.com/7e661d5e401/83d36d73-b2f5-4912-9257-a8d99078f182.png");
		
		return content;
	}

}
