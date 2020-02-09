package co.com.cyxtera.business;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.cyxtera.documents.ClientUrl;
import co.com.cyxtera.repository.ClientUrlRepository;

@Service
public class ClientUrlBusiness {

	@Autowired
	private ClientUrlRepository clientUrlRepository;
	
	
	public void processUrl(String url) {
		NumberFormat formatter = new DecimalFormat("#0.0");     
		Random r = new Random();
		double qualification = Double.valueOf(formatter.format(1 * r.nextDouble()));
		ClientUrl clientUrl = new ClientUrl();		
		clientUrl.setUrl("nueva Url");
		clientUrl.setQualification(qualification);
		clientUrlRepository.save(clientUrl);
	}
	
}
