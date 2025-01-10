//public class LibraryPlus {
//    public class Library {
//        LibraryItem[] items;
//        LibraryUser[] users;
//
//        public Library() {
//            items = new LibraryItem[3];
//            users = new LibraryUser[4];
//        }
//
//        public Library(LibraryItem[] items, LibraryUser[] users) {
//            this.items = items;
//            this.users = users;
//        }
//
//
//        public class BorrowingManager implements Borrowable, Returnable {
//            public LibraryItem borrowItem(LibraryUser user, String itemTitle) {
//                for (int i = 0; i < items.length; i++) {
//                    if (items[i] != null && items[i].getTitle().equals(itemTitle)) {
//                        LibraryItem item = items[i];
//                        items[i] = null;
//                        return item;
//                    }
//                }
//                return null;
//            }
//
//
//
//
//            public LibraryItem borrowItem(LibraryUser user, LibraryItem item) {
//                public void returnItem(LibraryUser Object LibraryItem;
//                user, LibraryItem item) {
//                    for (int i = 0; i < items.length; i++) {
//                        if (items[i] == null) {
//                            items[i] = item;
//                        }
//                    }
//                }
//            }
//
//            public class ItemCatalog {
//                public boolean addItem(LibraryItem item) {
//                    for (int i = 0; i < items.length; i++) {
//                        if (items[i] == null) {
//                            items[i] = item;
//                            return true;
//                        }
//                    }
//                    return false;
//                }
//
//
//                public boolean removeItem(int itemId) {
//                    for (int i = 0; i < items.length; i++) {
//                        ;
//                        if (items[i] != null && items[i].getItemId() == itemId) {
//                            items[i] = null;
//                            return true;
//                        }
//                    }
//                    return false;
//                }
//
//                public void listItems() {
//                    for (LibraryItem li : items) {
//                        System.out.println(li);
//                    }
//                }
//            }
//
//            public class UserRegistry {
//
//                public LibraryItem[] getItems() {
//                    return items;
//                }
//
//                public LibraryUser[] getUsers() {
//                    return users;
//                }
//
//                public void setUsers(LibraryUser[] users) {
//
//                }
//
//
//                public boolean addUser(LibraryUser user) {
//
//                    for (int i = 0; i < users.length; i++) {
//                        if (users[i] == null) {
//                            users[i] = user;
//                            return true;
//                        }
//                    }
//                    return false;
//                }
//
//                public boolean removeUser(LibraryUser user) {
//                    for (int i = 0; i < users.length; i++) {
//                        if (users[i] != null && users[i].getName().equals(getUsers())) {
//                            users[i] = null;
//                            return true;
//                        }
//                    }
//                    return false;
//
//                }
//
//            }
//        }
//
//
//
//
//
//
//
//    }
