/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    /*if(head == null){
            return false;
        }
        let slow= head, fast = head.next;
        
        while(slow != null && fast != null){
            if(fast.next == null){
                return false;
            }
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;*/
    let fast = head;
    let slow = head;

    while (slow !== null && slow.next !== null && fast.next !== null && fast.next.next !== null) {
        fast = fast.next.next;
        slow = slow.next;

        if (fast === slow) {
            return true;
        }
    }
    return false;
    
};