public class Stack {
    int[] nums = new int[5];
    int top = -1;
    public void push(int ele)
    {
        if(top == 4)
        {
            System.out.println("Stack is already full!");
        }
        else {
            top++;
            nums[top] = ele;
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty!");
            return -1;
        }
        int ele = nums[top];
        nums[top] = 0;
        top--;
        return ele;
    }

    public int peek()
    {
        return nums[top];
    }

    public void show()
    {
        for(int i: nums)
        {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public int size()
    {
        return top+1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(26);
        stack.push(12);
        stack.pop();
        stack.push(53);
        stack.push(100);
        System.out.println(stack.peek());

        stack.show();
        System.out.println("Size is: "+stack.size());
        System.out.println(stack.isEmpty());
        stack.push(21);
        stack.push(56);
        stack.push(99);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
