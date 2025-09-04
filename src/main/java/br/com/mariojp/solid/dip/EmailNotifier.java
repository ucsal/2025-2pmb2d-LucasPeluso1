package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender ms;

	public EmailNotifier() {
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            this.ms = new NoopMailSender();
        } else {
            this.ms = new SmtpClient();
        }
    }
	public void welcome(User user) {
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			// Estado inicial: ainda assim usa SMTP real (bug proposital)
		}
		
	}
}
