package Stack;
public class MainStacks {

	public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // should print 3
        System.out.println(stack.pop()); // should print 3
        System.out.println(stack.pop()); // should print 2
        System.out.println(stack.isEmpty()); // should print false
    }
}
