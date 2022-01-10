package eTicaret.core.concretes;

import eTicaret.GoogleManager;
import eTicaret.core.abstracts.GoogleService;

public class GoogleAdapter implements GoogleService {

	@Override
	public void addToGoogle(String message) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.add("google ile kaydolundu");
	}

}
