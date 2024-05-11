package Decorator;

import User.Registrationform1;

public class ValidationDecorator implements RegistrationDecorator  {
    private Registrationform1 form;

    public ValidationDecorator(Registrationform1 form) {
        this.form = form;
    }

    @Override
    public void actionPerformed() {
        form.validateInputs();
    }
}
