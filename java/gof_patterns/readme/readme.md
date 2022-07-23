# Welcome to Java Design patterns

## The Singleton pattern with Eager Initialization
Eager initialization: This is the simplest method of creating a singleton class. In this, object of class is created when it is loaded to the memory by JVM. It is done by assigning the reference an instance directly. 
~~~~java 
public class SingletonPattern {
	// public instance initialized when loading the class
	private static final SingletonPattern instance = new SingletonPattern();

	private SingletonPattern() {
		// private constructor
	}

	public static SingletonPattern getInstance() {
		return instance;
	}
}
~~~~
* The above code is a example of singleton pattern using java eager initialization 

* Pros:
    * Very simple to implement.
* Cons: 
    *  May lead to resource wastage. Because instance of class is created always, whether it is required or not. 
    *  CPU time is also wasted in creation of instance if it is not required.
    *  Exception handling is not possible.
    
    
## Singleton Pattern Using Static Block 
Using static block: This is also a sub part of Eager initialization. The only difference is object is created in a static block so that we can have access on its creation, like exception handling. In this way also, object is created at the time of class loading. 
It can be used when there is a chance of exceptions in creating object with eager initialization. 

~~~~java
package lab4;

public class SingletonStatic {
	// public instance
	public static SingletonStatic instance;

	private SingletonStatic() {
		// private constructor
	}

	static {
		// static block to initialize instance
		instance = new SingletonStatic();
	}
}
~~~~

* Pros:
    * Very simple to implement.
    *  Exception handling is  possible in static block.
* Cons: 
    *  May lead to resource wastage. Because instance of class is created always, whether it is required or not. 
    *  CPU time is also wasted in creation of instance if it is not required.
    
## Singleton pattern using Lazy Initialization 
In this method, object is created only if it is needed. This may prevent resource wastage. An implementation of getInstance() method is required which return the instance. There is a null check that if object is not created then create, otherwise return previously created. To make sure that class cannot be instantiated in any other way, constructor is made final. As object is created with in a method, it ensures that object will not be created until and unless it is required. Instance is kept private so that no one can access it directly. 
It can be used in a single threaded environment because multiple threads can break singleton property because they can access get instance method simultaneously and create multiple objects. 
 
 
~~~~java
package lab4;

public class SingleTonLazyInit {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingleTonLazyInit instance;

	private SingleTonLazyInit() {
		// private constructor
	}

	// method to return instance of class
	public static SingleTonLazyInit getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new SingleTonLazyInit();
		}
		return instance;
	}
}


~~~~

* Pros
    * Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
    * Exception handling is also possible in method.
* Cons 
    * Every time a condition of null has to be checked. 
    * instance can’t be accessed directly.
    * In multithreaded environment, it may break singleton property.
    
    

## Thread Safe Singleton 
Thread Safe Singleton: A thread safe singleton in created so that singleton property is maintained even in multithreaded environment. To make a singleton class thread-safe, getInstance() method is made synchronized so that multiple threads can’t access it simultaneously.

~~~~java
package lab4;

public class ThreadSafeSingleton {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
		// private constructor
	}

	// synchronized method to control simultaneous access
	synchronized public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
~~~~


* Pros:
    * Lazy initialization is possible.
    * It is also thread safe.
* Cons 
    * getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.
    

## Lazy Initialization Singleton with Double check 
Lazy initialization with Double check locking: In this mechanism, we overcome the overhead problem of synchronized code. In this method, getInstance is not synchronized but the block which creates instance is synchronized so that minimum number of threads have to wait and that’s only for first time.

~~~~java
package lab4;

public class SingleThreadSafeDoubleCheck {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingleThreadSafeDoubleCheck instance;

	private SingleThreadSafeDoubleCheck() {
		// private constructor
	}

	public static SingleThreadSafeDoubleCheck getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (SingleThreadSafeDoubleCheck.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new SingleThreadSafeDoubleCheck();
				}

			}
		}
		return instance;
	}
}
~~~~ 


* Pros:
    * Lazy initialization is possible.
    * It is also thread safe.
    * Performance overhead gets reduced because of synchronized keyword in double check and only when required 
Cons: 
    * First time, it can affect performance.
    
    
# Self Study 
Singleton as enums 



## The FactoryMethod Pattern in java 
a creational design pattern which talks about the creation of an object. The factory design pattern says that define an interface ( A java interface or an abstract class) and let the subclasses decide which object to instantiate. 

Create a java Interface for messaging 
~~~~java
public interface Messaging {
    void sendMessage();
}
~~~~

Create classes  for the Implemenations
e.g. SMS Messaging ... and So forth  
SMSMessaging
~~~~java
package lab5;

public class SMSMessaging implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending an SMS OTP message");
	}
}
~~~~
EmailMessaging
~~~~java 
package lab5;

public class EmailMessaging implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending an Email OTP ");
	}
}
~~~~

PushNotificationMessaging 
~~~~java
package lab5;

public class PushNotificationMessage implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending an PushNotification OTP ");
	}
}
~~~~

* Now lets create a messaging factory class to instantiate these classes .  
~~~~java
package lab5;

public class MessagingFactory {
	public Messaging createNotification(String channel) {
		if (channel == null || channel.isEmpty())
			return null;
		if ("SMS".equals(channel)) {
			return new SMSMessaging();
		} else if ("EMAIL".equals(channel)) {
			return new EmailMessaging();
		} else if ("PUSH".equals(channel)) {
			return new PushNotificationMessage();
		}
		return null;
	}
}
~~~~

* Pro : 
    *  The Left hand Side is always a interface which will allow the you to decide runtime which object to be constructed 
    *  Hooks Required Sub classes 
* Cons  
    *  In Factory Method pattern, the factory used for creating the objects is bound with the client code, i.e., it is difficult to use a different factory for creating objects. 



## The Proxy Pattern 
* Subject – is an interface which expose the functionality available to be used by the clients.

~~~~java 
package lab6;
public interface IApplication 
{
    public void doSomething();
}
~~~~

* Subject(Actual Implementation) – is a class implementing Subject and it is concrete implementation which needs to be hidden behind a proxy.
package lab6;

~~~java
public class ApplicationImpl implements IApplication {

	@Override
	public void doSomething() {
		System.out.println("Performing work in real Application....");
	}

}
~~~

* Proxy – hides the real object by extending it and clients communicate to real object via this proxy object. Usually frameworks create this proxy object when client request for real object.

~~~java
package lab6;

public class ApplicationProxy implements IApplication {

	private IApplication target;

	public ApplicationProxy(IApplication application) {
		this.target = application;
	}

	@Override
	public void doSomething() {

		System.out.println("Do the proxy work");
		target.doSomething();
	}
}

~~~


*  The Factory with Proxy to make it more real world 
~~~java 
package lab6;

public class ApplicationFactory {
	public static IApplication createApplication() {
		return new ApplicationProxy(new ApplicationImpl());
	}
}
~~~


* The Client Code which is having no exposure to proxy and uses the standard RHS is a instance of LHS 

~~~ java 
package lab6;

public class ProxyClient {

	public static void main(String[] args) {
		IApplication application = ApplicationFactory.createApplication();
		application.doSomething();
	}
}

~~~  


# Self Study 
## Proxies are divided in the following categories 
* Remote proxy – represent a remotely lactated object. To talk with remote objects, the client need to do additional work on communication over network. A proxy object does this communication on behalf of original object and client focuses on real talk to do.
* Virtual proxy – delay the creation and initialization of expensive objects until needed, where the objects are created on demand. Hibernate created proxy entities are example of virtual proxies.
* Protection proxy – help to implement security over original object. They may check for access rights before method invocations and allow or deny access based on the conclusion.
* Smart Proxy – performs additional housekeeping work when an object is accessed by a client. An example can be to check if the real object is locked before it is accessed to ensure that no other object can change it.

Dont Forget that proxies are focused on controlling the access the the actual object Study the Decorator pattern on your own to study the requirement of Object Enhancer or A pattern that adds functionality to your object .


## Facade Pattern 
Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem.
a facade encapsulates a complex subsystem behind a simple interface. It hides much of the complexity and makes the subsystem easy to use. 
 
 
Lets us consider a Encryption Decyrption scenario

We will create 3 Different complex Classes 

~~~java
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class MD5Encryptor {
    public String encrypt(String text) {
        String hash = "";
        try {
            MessageDigest msgDigest = MessageDigest.getInstance("MD5");
            msgDigest.update(text.getBytes());
            
            byte textBytes[] = msgDigest.digest();
     
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < textBytes.length; i++) {
             buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
                hash = buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return hash;
    }
}
~~~


~~~java
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class SHA {
    public String encrypt(String text) {
        String hash = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA");
            byte[] textBytes = digest.digest(text.getBytes(StandardCharsets.UTF_8));
            
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < textBytes.length; i++) {
             buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
            }
                hash = buffer.toString();
        }
        catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hash;
    }
}
~~~


~~~java 
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class SHA256 {
    public String encrypt(String text) {
        String hash = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] textBytes = digest.digest(text.getBytes(StandardCharsets.UTF_8));
            
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < textBytes.length; i++) {
             buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
            }
                hash = buffer.toString();
        }
        catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hash;
    }
}
~~~

* Lets Create a Easy Facade Interface 


~~~java 
package lab7;

public interface EncryptorFacade {
	public String encrypt(String type, String text);
}
~~~


*  Lets Create and Encryption Facade Impl 

The Facade interface  above exposes a single public method with two arguments. One of these arguments is the type of hashing that is required and the second argument is the text that needs to be encrypted. Notice here that based on the type of hashing that is required, the Facade classes creates objects of different encryptor classes(complicated classes) and hashes the text accordingly. In this manner, just using a single method, the Facade class took care of the different types of encryption that was possible. This method can now be used by the client directly by creating the object of the facade class.

~~~java 
package lab7;

public class EncryptorFacade implements IEncryptorFacade {
	public String encrypt(String type, String text) {
		String hash = "";
		if (type == "MD5") {
			MD5 e = new MD5();
			hash = e.encrypt(text);
		} else if (type == "SHA") {
			SHA e = new SHA();
			hash = e.encrypt(text);
		} else if (type == "SHA256") {
			SHA256 e = new SHA256();
			hash = e.encrypt(text);
		}
		return hash;
	}
}
~~~

* The client Code to test the Facade 

~~~java 
package lab7;

public class Client {
	public static void main(String[] args) {
		String myText = "Encrypt this text";
		EncryptorFacade e = new EncryptorFacade();
		System.out.println("MD5 encryption");
		System.out.println(e.encrypt("MD5", myText));
		System.out.println("SHA encryption");
		System.out.println(e.encrypt("SHA", myText));
		System.out.println("SHA256 encryption");
		System.out.println(e.encrypt("SHA256", myText));
	}
}
~~~ 


* Pro's  
    The Facade design pattern is primarily focused on providing a systematic solution to conceal implementation of complicated classes. However, in addition to the improved project structure, there are several other benefits of the Facade Design Pattern. These benefits are explained below
* Con's  
    No possible drawback but will have many interfaces and implementation for the facades if not properly implemented may cause inheritence issues or code duplications
    


## Self Study 
Command  Pattern   
[Read More About the Command Pattern](https://en.wikipedia.org/wiki/Command_pattern)






