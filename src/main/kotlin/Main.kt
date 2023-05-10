fun main(args: Array<String>) {
    val mobilePhone = MobilePhone()

    println("\nНовый контакт: ")
    mobilePhone.addNewContact(Contact("Татьяна", "+7-909-567-34-23"))
    mobilePhone.addNewContact(Contact("Олег", "+7-954-945-36-43"))
    mobilePhone.addNewContact(Contact("Наталья", "+7-955-909-12-21"))
    mobilePhone.addNewContact(Contact("Петр", "+7-999-683-00-00"))
    mobilePhone.printContacts()

    println("\nРедактирование контакта: ")
    mobilePhone.updateContact(Contact("Татьяна", "+7-909-567-34-23"), Contact("Татьяна", "+7-999-657-33-23"))
    mobilePhone.printContacts()

    println("\nУдаление: ")
    mobilePhone.removeContact(Contact("Олег", "+7-954-945-36-43"))
    println("Контакт удален ")
    mobilePhone.printContacts()

    println("\nПоиск контакта Contact: ")
    val status = mobilePhone.findContact(Contact("Наталья", "+7-955-909-12-21"))
    if (status >= 0) {
        println("Контакт существует")
    }
    else {
        println("Контакт не существует")
    }

    println("\nПоиск контакта по имени : ")
    val foundContact = mobilePhone.queryContact("Петр")
    if (foundContact != null) {
        println("${foundContact.name} " +
                "\n${foundContact.phoneNumber}")
    }
}