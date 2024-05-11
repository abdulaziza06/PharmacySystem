package Decorator;
import User.Registrationform1;

public class EncryptionDecorator implements RegistrationDecorator {

    private Registrationform1 form;

    public EncryptionDecorator(Registrationform1 form) {
        this.form = form;
    }

    @Override
    public void actionPerformed() {
        form.encryptData();
    }
}
