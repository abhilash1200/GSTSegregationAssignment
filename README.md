###This Project is created for calculating GST on products with price more than 2000.

OOPS, in Use:

1. Class
2. Object
3. Inheritance
4. Encapsulation
5. Abstraction
6. Method OverRiding

DataStructures in Use:
1. ArrayList

Java8 Features in Use:
1. Streams
2. Lambda

BaseGstPercent is Abstract class and contains abstract method getGstPercent() to fetch GST. and some non-abstract methods like getGstOnElectronics() and getGstOnAutoMobiles() for category Specific.

this gstPercent is created with Abstraction for scalability purposes in the future.

GstOnApparel and GstOnConsumerGoods class extends BaseGSTPercent and overrides the getGstPercent() method

Products Package Consist of Products details and Product Parent Company Name for Billing Purpose

merchant Package consist of 2 Classes
   1. GST Calculator
   2. BillingCounterTest
   
GST Calculator  class will collect  Details of Products as an Array List

BillingCounterTest Initiates the Products adding to cart (arrayList) Class and Process the final price based on Category

Steps to Run:

1. Clone the Repo
2. ./gradlew build
3. Run the @Test method in BillingCounterTest class in src/test/java/merchant