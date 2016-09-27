package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.InvalidStorageFilePathException;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/*
 * Abstraction of a store of data
 */
public interface Storage {

    /*
     * Initialise the default data store to be a StorageFile.
     */
    static Storage initialise() throws InvalidStorageFilePathException {
        return new StorageFile();
    }

    /*
     * Save the address book data.
     */
    void save(AddressBook addressBook) throws StorageOperationException;

    /*
     * Load the address book from this data store.
     */
    AddressBook load() throws StorageOperationException;

    public String getPath();
}
