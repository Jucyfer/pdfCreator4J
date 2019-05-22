package net.jyf.pdf.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfVersion;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.WriterProperties;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class T1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自动生成的方法存根
		PdfWriter writer = new PdfWriter(new FileOutputStream("/home/jyf/git/foo.pdf"),
				new WriterProperties().setPdfVersion(PdfVersion.PDF_2_0));
		PdfDocument pdfDocument = new PdfDocument(writer);
		pdfDocument.setTagged();
		Document document = new Document(pdfDocument);
		for (var i = 0; i < 10; i++) {
			document.add(new Paragraph("No."+i+": Hello world!"));
		}
		document.close();
		System.out.println("done at:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
	}

}
