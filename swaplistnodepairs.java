public class swaplistnodepairs
{
    public class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data)
    {
        if(head==null)
        {
            Node newnode=new Node(data);
            head=tail=newnode;
            size=size+1;
            return;
        }
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        size=size+1;
    }
    public void printlinkedlist()
    {
        Node b=head;
        while(b!=null)
        {
            System.out.println(b.data);
            b=b.next;
        }
    }
    public void print1()
    {
        Node newnode=new Node(0);
        newnode.next=head;
        Node first=head;
        if(head==null)
        {
            return;
        }
        else if(head.next==null)
        {
            return;
        }
        else
        {
            while(newnode.next!=null&&newnode.next.next!=null)
            {
                newnode.next=print2(newnode.next,newnode.next.next);
                newnode=newnode.next.next;
            }
        }
    }
    public Node print2(Node a,Node b)
    {
        a.next=b.next;
        b.next=a;
        return(b);
    }
        public static void main(String args[])
    {
        swaplistnodepairs a=new swaplistnodepairs();
        a.addfirst(1);
        a.addfirst(2);
        a.addfirst(3);
        a.addfirst(4);
        a.addfirst(5);
        a.addfirst(6);
        a.addfirst(7);
        a.print1();
        a.printlinkedlist();
    }
}