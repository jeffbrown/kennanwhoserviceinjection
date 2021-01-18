import kennanwhoserviceinjection.APIPaymentCreateCommand

beans = {
    aPIPaymentCreateCommand(APIPaymentCreateCommand) { bean ->
        bean.autowire = 'byName'
    }
}
