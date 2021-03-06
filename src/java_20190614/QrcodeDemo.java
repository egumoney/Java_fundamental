package java_20190614;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrcodeDemo {

	public boolean isCreateQrcode(String text) throws WriterException, IOException {
		QRCodeWriter writer = new QRCodeWriter();
		// CodaBarWriter writer =Writer.en
		BitMatrix qrCode = writer.encode("http:\\www.naver.com", BarcodeFormat.QR_CODE, 300, 300);
		BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(qrCode);
		File f = new File("c:\\down\\qrcode.png");
		return ImageIO.write(qrImage, "PNG", f);
	}

	public static void main(String[] args) throws WriterException, IOException {
		/*
		 * QRCodeWriter writer = new QRCodeWriter(); // CodaBarWriter writer
		 * =Writer.en BitMatrix qrCode = writer.encode("http:\\www.naver.com",
		 * BarcodeFormat.QR_CODE, 300, 300); BufferedImage qrImage =
		 * MatrixToImageWriter.toBufferedImage(qrCode);
		 * 
		 * File f = new File("c:\\down\\qrcode.png"); boolean isSuccess =
		 * ImageIO.write(qrImage, "PNG", f); System.out.println(isSuccess);
		 */
		
	}
}
