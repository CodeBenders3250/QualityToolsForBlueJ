# Tool Encapsulation

## The tools of the trade

Students can benefit from the use of many coding tools, the quality tools for BlueJ extension intends to deliver these to students in an easy to use extension that will put  professional level development tools right in the students’ hands.  

The question we are posing is: what is the best way to go about connecting these tools to BlueJ?

![Relationship between QualityTools and other tools](https://i.ibb.co/Gs05pym/Screen-Shot-2019-11-12-at-9-40-06-AM.png)

**Above diagram**: BlueJ will need to implement the QualityTools for BlueJ project. How the project will interact with the rest of the tools (Checkstyle, Spotbugs, etc.) is undefined as of yet in the project. The above diagram shows the question of how to connect the QualityTools for BlueJ project between BlueJ and the quality tools.

## What are we doing to help?

The tools intended for this extension are many and they are of many different flavors. Is it a command line tool?  What is the file extension?  Was it developed in Java or some other language?

The Tool Encapsulation class is intended to make all of these questions irrelevant to users, as we will give developers one convenient class from which to get any tool working with the Quality Tools for BlueJ Extension.

## Think of this class as a kind of adapter

You know that drawer you have in your house that is full of spare cords?  You don’t know what they go to, yet you don’t want to get rid of them because you know you might need them one day.

If you had a universal adapter, you wouldn’t need all those old cords.  Plug your tool into Encapsulation class and put that right into Quality Tools for BlueJ Extension and off you go, adding custom code to bring the full power of your favorite tool to use in BlueJ.

![Encapsulation class](https://i.ibb.co/1QsPk1P/Screen-Shot-2019-11-12-at-9-40-19-AM.png)

**Above diagram**: The diagram above proposes a way to bridge the gap between QualityTools for BlueJ and the different tools that might need to be used. This is an encapsulation class, which acts as the bridge between the BlueJ extension class and the tools we wish to implement. 
