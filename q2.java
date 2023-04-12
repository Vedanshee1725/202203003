class q2
{
    class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    node head;
    public void printlist()
    {
        if(head==null)
        { System.out.println("Empty list");return;}

        node currnode=head;
        while(currnode!=null)
        {
            System.out.print(currnode.data +"->");
            currnode=currnode.next;
        }
        System.out.println("null");
    }
    public void addlast(int data)
    {
        node newNode=new node(data);
        if(head==null)
        { head=newNode;
            return;}
        node currnode=head;
        while(currnode.next!=null)
        {
            currnode=currnode.next;
        }
        currnode.next=newNode;
    }
    public void deletenum()
    {
        node temp=head;node prev=head;
        while(temp!=null){
            if(temp.data<=25)
            {
                if(prev==null)
                {
                    head=temp.next;
                }
                else{
                    prev.next=temp.next;
                }
                
            }
            else
            {
                prev=temp;
            }
            temp=temp.next;
        }
        temp = head;
        
    }
    public void deletefirst()
        {
            if(head==null)
            {System.out.println("The list is empty");return;}
            head=head.next;
    
        }
    public static void main(String args[])
    {
        q2 list=new q2();
        for(int i=1;i<=50;i++)
        {
            list.addlast(i);
        }
        list.deletenum();list.deletefirst();
        list.printlist();
    }
}
