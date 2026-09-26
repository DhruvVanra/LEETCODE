class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class removeDublicateFromSortedList_II80 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = head;
        ListNode prev = dummy;

        while (temp != null) {

            if (temp.next != null && temp.val == temp.next.val) {

                while (temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }

                prev.next = temp.next;

            } else {
                prev = prev.next;
            }

            temp = temp.next;
        }

        return dummy.next;
    }
     static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        removeDublicateFromSortedList_II80 obj =
                new removeDublicateFromSortedList_II80();

        ListNode result = obj.deleteDuplicates(head);

        System.out.println("After Removing Duplicates:");
        printList(result);
    }
}
