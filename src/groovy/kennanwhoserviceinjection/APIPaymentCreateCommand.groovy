package kennanwhoserviceinjection

class APIPaymentCreateCommand {
    def cardTokensService

    int getTheAnswer() {
        cardTokensService.theAnswer
    }
}