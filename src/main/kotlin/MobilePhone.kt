class MobilePhone() {
    private val contacts = ArrayList<Contact>()

    fun addNewContact(contact: Contact): Boolean {
        if (findContact(contact) >= 0) {
            return false
        }
        contacts.add(contact)
        return true
    }

    fun updateContact(oldContact: Contact, newContact: Contact): Boolean {
        val status = findContact(oldContact)
        if (status < 0) {
            return false
        }
        contacts[status] = newContact
        return true
    }

    fun removeContact(contact: Contact): Boolean {
        val status = findContact(contact)
        if (status < 0) {
            return false
        }
        contacts.removeAt(status)
        return true
    }

    fun findContact(contact: Contact): Int {
        return contacts.indexOf(contact)
    }

    fun queryContact(name: String): Contact? {
        for (contact in contacts) {
            if (contact.name == name) {
                return contact
            }
        }
        return null
    }

    fun printContacts() {
        println("Contact List:")
        for (i in 0 until contacts.size) {
            println("${i+1}." +
                    "\nИмя - ${contacts[i].name}" +
                    "\nТелефон - ${contacts[i].phoneNumber}")
        }
    }
}