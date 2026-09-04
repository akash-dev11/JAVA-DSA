package Easy;

public class Merge {

    // Linked List Node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Merge Two Sorted Lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode i = list2;
        ListNode j = list1;

        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while (i != null && j != null) {

            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
            } 
            else {
                k.next = j;
                j = j.next;
            }

            k = k.next;
        }

        // Jo list bach gayi
        if (i != null) {
            k.next = i;
        } 
        else {
            k.next = j;
        }

        return dummy.next;
    }

    // Print Linked List
    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // list1 = 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // list2 = 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        // Merge
        ListNode result = mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        printList(result);
    }
}
