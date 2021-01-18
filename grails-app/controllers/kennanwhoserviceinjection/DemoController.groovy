package kennanwhoserviceinjection

class DemoController {

    APIPaymentCreateCommand aPIPaymentCreateCommand

    def index() {
        int answer = aPIPaymentCreateCommand.theAnswer
        render "The answer is $answer"
    }
}
