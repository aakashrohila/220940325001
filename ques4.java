class GrandParent
{
	String grandFatherName;
	String grandMotherName;
	
	
	GrandParent()
	{}
	
	GrandParent(String gfn , String gmn)
	{
		grandFatherName = gfn;
		grandMotherName = gmn;
		
		
		System.out.println("GrandFather Name is : " + grandFatherName);
		System.out.println("GrandMother Name is : " + grandMotherName);
	}
	
}

class Parent extends GrandParent
{
	String fatherName;
	String motherName;
	
	Parent()
	{}
	
	Parent(String fn , String mn , String gfn , String gmn)
	{
		System.out.println("Father Name is : " + fn);
		System.out.println("Mother Name is : " + mn);
		Parent p2 = new Parent(gfn,gmn);
	}
	
	Parent(String gfn , String gmn)
	{
		GrandParent gp = new GrandParent(gfn , gmn);
	}
}


class Child extends Parent
{
	Child()
	{}
	
	Child(String fn , String mn , String gfn , String gmn)
	{
		Parent p1 = new Parent(fn,mn,gfn,gmn);
	}
	
	public static void main(String args[])
	{
		Child c = new Child("Batman","CatWoman","IronMan","WonderWoman");
	}
}

