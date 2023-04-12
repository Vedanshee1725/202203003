class q3
{
    class node
    {
        String data;
        node next;
        node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    node head;
    // adding the first element
    public void addfirst(String data)
    {
        node newNode=new node(data);
        if(head==null)
        { head=newNode;return;}
        newNode.next=head;
        head=newNode;
    }

    //adding the last elemnet
    public void addlast(String data)
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

    //delete the first element
    public void deletefirst()
    {
        if(head==null)
        {System.out.println("The list is empty");return;}
        head=head.next;

    }

    //delete the last element
    public void deletelast()
    {
        if(head==null)// no element
        {System.out.println("The list is empty");return;}

        if(head.next==null)// only one element
        { head=null; return ;}

        node seclast=head;
        node lastnode=head.next;
        while(lastnode.next!=null)
        {
            lastnode=lastnode.next;
            seclast=seclast.next;
        }

        seclast.next=null;
    }

    //printing the list
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
    public static void main(String[] args)
    {
        q3 list=new q3();
        list.addfirst("learning");
        list.addfirst("am");
        list.printlist();
        list.addfirst("I");
        list.addlast("Java");
        list.printlist();
        System.out.println("Delete first");
        list.deletefirst();
        list.printlist();
        System.out.println("Delete last");
        list.deletelast();
        list.printlist();       

    }
}
