# **Cloud Computing**

> **Cloud Computing with Google Cloud**


Cloud Computing is a general term used to describe a new class of network based computing that takes place over the Internet, 
basically a step on from Utility Computing
a collection/group of integrated and networked hardware, software and Internet infrastructure (called a platform).
Using the Internet for communication and transport provides hardware, software and networking services to clients
These platforms hide the complexity and details of the underlying infrastructure from users and applications by providing very simple graphical interface or API (Applications Programming Interface).

In addition, the platform provides on demand services, that are always on, anywhere, anytime and any place. 
Pay for use and as needed, elastic
scale up and down in capacity and functionalities
The hardware and software services are available to
general public, enterprises, corporations and businesses markets

Cloud computing is an umbrella term used to refer to Internet based development and services

A number of characteristics define cloud data, applications services and infrastructure:
Remotely hosted: Services or data are hosted on remote infrastructure. 
Ubiquitous: Services or data are available from anywhere.
Commodified: The result is a utility computing model similar to traditional that of traditional utilities, like gas and electricity - you pay for what you would want!

Cloud computing is evolving due to fast performance, better manageability, and less maintenance. It helps organizations to minimize the number of resources and overall infrastructure costs. Additionally, it helps IT teams better focus on the important applications, services, and processes and achieve the company's goals.

Typically, the cloud-computing providers offer their services according to the following three standard models:


The “no-need-to-know” in terms of the underlying details of infrastructure, applications interface with the infrastructure via the APIs.
The “flexibility and elasticity” allows these systems to scale up and down at will
utilising the resources of all kinds
CPU, storage, server capacity, load balancing, and databases
The “pay as much as used and needed” type of utility computing and the “always on!, anywhere and any place” type of network-based computing.

Cloud are transparent to users and applications, they can be built in multiple ways 
branded products, proprietary open source, hardware or software, or just off-the-shelf PCs.
In general, they are built on clusters of PC servers and off-the-shelf components plus Open Source software combined with in-house applications and/or system software.

> **Cloud Models** 
* Platform as a Service (PaaS)
* Software as a Service (SaaS)
* Infrastructure as a Service (IaaS)


![Platforms](https://i.ibb.co/XpDd7rH/cloud.jpg)



> **The  Google Cloud Platform** 


![GCP](https://i.ibb.co/zff9NQJ/googlearch.png)

is known as one of the leading cloud providers in the IT field. The services and features can be easily accessed and used by the software developers and users with little technical knowledge. Google has been on top amongst its competitors, offering the highly scalable and most reliable platform for building, testing and deploying the applications in the real-time environment.

Apart from this, GCP was announced as the leading cloud platform in the Gartner's IaaS Magic Quadrant in 2018. Gartner is one of the leading research and advisory company. Gartner organized a campaign where Google Cloud Platform was compared with other cloud providers, and GCP was selected as one of the top three providers in the market.

Most companies use data centers because of the availability of cost forecasting, hardware certainty, and advanced control. However, they lack the necessary features to run and maintain resources in the data center. GCP, on the other side, is a fully-featured cloud platform that includes:

**Capacity**: Sufficient resources for easy scaling whenever required. Also, effective management of those resources for optimum performance.
Security: Multi-level security options to protect resources, such as assets, network and OS -components.
Network Infrastructure: Number of physical, logistical, and human-resource-related components, such as wiring, routers, switches, firewalls, load balancers, etc.
Support: Skilled professionals for installation, maintenance, and support.
Bandwidth: Suitable amount of bandwidth for peak load.
Facilities: Other infrastructure components, including physical equipment and power resources.

> **Google App Engine**

It is a cloud computing platform that follows the concept of Platform-as-a-Service to deploy PHP, Java and other software. It is also used to develop and deploy web-based software in Google-managed data centers. The most significant advantage of Google App Engine is its automatic scaling capability. This means that the App Engine automatically allocates more resources for the application when there is an increase in requests.

*  **The Project** 
A project organizes all your Google Cloud resources. A project consists of a set of users; a set of APIs; and billing, authentication, and monitoring settings for those APIs. So, for example, all of your Cloud Storage buckets and objects, along with user permissions for accessing them, reside in a project.

* **The Application** 
Your Application which comprises the modern app autonomous web applications, microservices which allows you to 
quickly reach customers and end users by deploying web apps on App Engine. With zero-config deployments and zero server management, App Engine allows you to focus on writing code. Plus, App Engine automatically scales to support sudden traffic spikes without provisioning, patching, or monitoring.


> **App Engine Architecture**

![](https://i.ibb.co/Mszp2D7/appengined.png)


> **Kubernetes Engines**  

This computing service is responsible for offering a platform for automatic deployment, scaling, and other operations of application containers across clusters of hosts. The engine supports several container tools like a docker, etc.

**Containerized Deployments**
![Container](https://i.ibb.co/xqrQRhM/containerized-Deployement.png)


Containers are similar to VMs, but they have relaxed isolation properties to share the Operating System (OS) among the applications. Therefore, containers are considered lightweight. Similar to a VM, a container has its own filesystem, share of CPU, memory, process space, and more. As they are decoupled from the underlying infrastructure, they are portable across clouds and OS distributions.

Containers have become popular because they provide extra benefits, such as:

Agile application creation and deployment: increased ease and efficiency of container image creation compared to VM image use.
Continuous development, integration, and deployment: provides for reliable and frequent container image build and deployment with quick and efficient rollbacks (due to image immutability).
Dev and Ops separation of concerns: create application container images at build/release time rather than deployment time, thereby decoupling applications from infrastructure.
Observability not only surfaces OS-level information and metrics, but also application health and other signals.
Environmental consistency across development, testing, and production: Runs the same on a laptop as it does in the cloud.
Cloud and OS distribution portability: Runs on Ubuntu, RHEL, CoreOS, on-premises, on major public clouds, and anywhere else.
Application-centric management: Raises the level of abstraction from running an OS on virtual hardware to running an application on an OS using logical resources.
Loosely coupled, distributed, elastic, liberated micro-services: applications are broken into smaller, independent pieces and can be deployed and managed dynamically – not a monolithic stack running on one big single-purpose machine.
Resource isolation: predictable application performance.
Resource utilization: high efficiency and density


> **Kubernetes provides you with:**

* Service discovery and load balancing Kubernetes can expose a container using the DNS name or using their own IP address. If traffic to a container is high, Kubernetes is able to load balance and distribute the network traffic so that the deployment is stable.
* Storage orchestration Kubernetes allows you to automatically mount a storage system of your choice, such as local storages, public cloud providers, and more.
* Automated rollouts and rollbacks You can describe the desired state for your deployed containers using Kubernetes, and it can change the actual state to the desired state at a controlled rate. For example, you can automate Kubernetes to create new containers for your deployment, remove existing containers and adopt all their resources to the new container.
* Automatic bin packing You provide Kubernetes with a cluster of nodes that it can use to run containerized tasks. You tell Kubernetes how much CPU and memory (RAM) each container needs. Kubernetes can fit containers onto your nodes to make the best use of your resources.
* Self-healing Kubernetes restarts containers that fail, replaces containers, kills containers that don't respond to your user-defined health check, and doesn't advertise them to clients until they are ready to serve.
* Secret and configuration management Kubernetes lets you store and manage sensitive information, such as passwords, OAuth tokens, and SSH keys. You can deploy and update secrets and application configuration without rebuilding your container images, and without exposing secrets in your stack configuration.


> **Cloud Run**  

Cloud Run is a managed compute platform that enables you to run containers that are invocable via requests or events. Cloud Run is serverless: it abstracts away all infrastructure management, so you can focus on what matters most — building great applications.

It is built from Knative, letting you choose to run your containers either fully managed with Cloud Run, or in your Google Kubernetes Engine cluster with Cloud Run on GKE.

**Cloud Run Architecture** 
![cloudrun](https://i.ibb.co/YB0sVWt/cloudrun.png)




> **Compute Engine**  

Google Compute Engine offers virtual machines running in Google's data centers connected to its worldwide fiber network. The tooling and workflow offered enables scaling from single instances to global, load-balanced cloud computing.

These VMs boot quickly, come with persistent disk storage, and deliver consistent performance. The machines are available in many configurations including predefined sizes and can also be created with Custom Machine Types optimized for your specific needs.

> **Virtualization** 

Virtual workspaces: 
An abstraction of an execution environment that can be made dynamically available to authorized clients by using well-defined protocols, 
Resource quota (e.g. CPU, memory share),
Software configuration (e.g. O/S, provided services). 
Implement on Virtual Machines (VMs): 
Abstraction of a physical host machine,
Hypervisor intercepts and emulates instructions from VMs, and allows management of VMs,
VMWare, Xen, etc.
Provide infrastructure API:
Plug-ins to hardware/support structures

![Virtualizatio](https://i.ibb.co/NmyJqv6/virtualization.png)


Advantages of virtual machines:
* Run operating systems where the physical hardware is unavailable,
* Easier to create new machines, backup machines, etc.,
* Software testing using “clean” installs of operating systems and software,
* Emulate more machines than are physically available,
* Timeshare lightly loaded systems on one host,
* Debug problems (suspend and resume the problem machine),
* Easy migration of virtual machines (shutdown needed or not).
* Run legacy systems!




> **Cloud Storage**  

Cloud Storage is a service for storing your objects in Google Cloud. An object is an immutable piece of data consisting of a file of any format. You store objects in containers called buckets. All buckets are associated with a project, and you can group your projects under an organization.

After you create a project, you can create Cloud Storage buckets, upload objects to your buckets, and download objects from your buckets. You can also grant permissions to make your data accessible to members you specify, or - for certain use cases such as hosting a website - accessible to everyone on the public internet.

The Cloud Storage structure looks like this:

![](https://i.ibb.co/8gVLqRj/cloudstorage.png)

Several large Web companies are now exploiting the fact that they have data storage capacity that can be hired out to others. 
allows data stored remotely to be temporarily cached on desktop computers, mobile phones or other Internet-linked devices. 

Unlimited Storage.
Pay for what you use:
$0.20 per GByte of data transferred,
$0.15 per GByte-Month for storage used,
Second Life Update:
1TBytes, 40,000 downloads in 24 hours - $200,


**Basic tools for Cloud Storage**

Here are some basic ways you can interact with Cloud Storage:

Console: The Google Cloud Console provides a visual interface for you to manage your data in a browser.

gsutil: gsutil is a command-line tool that allows you to interact with Cloud Storage through a terminal. If you use other Google Cloud services, you can download the Cloud SDK, which includes gsutil along with the gcloud tool for other services.

Client libraries: The Cloud Storage client libraries allow you to manage your data using one of your preferred languages, including C++, C#, Go, Java, Node.js, PHP, Python, and Ruby.

REST APIs: Manage your data using the JSON or XML API.
Storage Services

**GCP has the following storage services**

 * Google Cloud Storage: It is an online data storage web service that Google provides to its users to store and access data from anywhere. The service also includes a wide range of features like maximum performance, scalability, security and sharing.
* Cloud SQL: It is a web-service that enables users to create, manage, and use relational databases stored on Google Cloud servers. The service itself maintains and protects the databases, which helps users focus on their applications and other operations.
* Cloud Bigtable: It is known for its fast performance and highly manageable feature. It is a highly scalable NoSQL database service that allows collecting and retaining data from as low as 1 TB to hundreds of PB.



**Use Case for google Storage**

![Storage](https://i.ibb.co/kxN0MzT/webserverstorage.png)





> Networking

GCP includes the following network services:




*  VPC: VPC stands for Virtual Private Network. The primary function of VPC is to offer a private network with routing, IP allocation, and network firewall policies. This will help to create a secure environment for the application deployments.


**A Virtual Private Cloud (VPC)**   
 network is a virtual version of a physical network, implemented inside of Google's production network, using Andromeda. A VPC network provides the following:

VPC Provides connectivity for your Compute Engine virtual machine (VM) instances, including Google Kubernetes Engine (GKE) clusters, App Engine flexible environment instances, and other Google Cloud products built on Compute Engine VMs.
Offers native Internal TCP/UDP Load Balancing and proxy systems for Internal HTTP(S) Load Balancing.
Connects to on-premises networks using Cloud VPN tunnels and Cloud Interconnect attachments.
Distributes traffic from Google Cloud external load balancers to backends.
Projects can contain multiple VPC networks. Unless you create an organizational policy that prohibits it, new projects start with a default network (an auto mode VPC network) that has one subnetwork (subnet) in each region.


**Cloud Load Balancing**   
As its name states, Cloud balancing is used to distribute workload across different computing resources to balance the entire system performance. This also results in cost-reduction. The process also helps in minimizing the availability and maximizing the capability of the resources.

With Cloud Load Balancing, a single anycast IP front-ends all your backend instances in regions around the world. It provides cross-region load balancing, including automatic multi-region failover, which gently moves traffic in fractions if backends become unhealthy. In contrast to DNS-based global load balancing solutions, Cloud Load Balancing reacts instantaneously to changes in users, traffic, network, backend health, and other related conditions.

![Cloud Load Balancer](https://cloud.google.com/load-balancing/images/lb-simple-overview.svg)


**Content Delivery Network**:   
CDN is a geographically distributed network of proxy servers and their data centers. The primary aim of using CDN is to provide maximum performance to the users. Additionally, it also helps deliver high availability of resources by equally distributing the related services to the end-users.

> Containers 
* Container Registry
  *   Artifact Registry is the evolution of Container Registry. As a fully-managed service with support for both container images and non-container artifacts, Artifact Registry extends the capabilities of Container Registry.

  * Artifact Registry provides the same container management features as Container Registry. You can start transitioning your automation to use Artifact Registry for your containers.



Backwards compatibility and co-existence
You can use both Artifact Registry and Container Registry in the same project. When you view a list of repositories with gcloud or Cloud Console, Artifact Registry also lists Container Registry repositories in the same project.

To take advantage of the expanded capabilities in Artifact Registry, you can transition your containers and your automation to Artifact Registry.

Transition options
You can transition to Artifact Registry using one of these options:

Standard repositories (Recommended)
Regular Artifact Registry repositories that support all features and are fully independent of any existing Container Registry hosts.
Repositories with gcr.io domain support (alpha)
Special repositories that are mapped to Container Registry gcr.io hostnames. These repositories support:

gcloud container images commands
Redirecting traffic from gcr.io hostnames to the corresponding gcr.io repositories in your project.
These repositories have some feature limitations. However, if you have a lot of tool configuration, scripts, or code with gcr.io references, a more tactical approach might be necessary to transition to Artifact Registry.

Both types of repositories can co-exist so that you can gradually transition. For example:

You can create gcr.io repositories in Artifact Registry to transition your existing Container Registry setup and create standard repositories for new work.
You can take a multi-staged approach to your transition. Transition to gcr.io repositories in Artifact Registry, then gradually shift to using to standard repositories as you update your automation to fully support Artifact Registry repository and image paths.
Setting up repositories
In Artifact Registry you must create repositories before you can push images to them. So a key part of moving to Artifact Registry is setting up Artifact Registry repositories and integrating them into your CI/CD automation.

To provide greater flexibility, there are some changes in how Artifact Registry represents repositories.

Container Registry
Each multi-regional location is associated with a single storage bucket. Organizing your images into repositories under a hostname is optional. Consider the following example that shows the image webapp in three locations:


us.gcr.io/my-project/webapp
us.gcr.io/my-project/team1/webapp
us.gcr.io/my-project/team2/webapp
Repositories are only an organizing mechanism and do not restrict access. Any user with access to the storage bucket for us.gcr.io in this project can access all versions of the webapp container image.

Artifact Registry
Each repository is a separate resource in your project. Since each repository is a unique resource, you can:

Give each repository a name, description, and labels
Create multiple repositories in the same location
Configure repository-specific permissions
In addition, the location of a repository can be a region or a multi-region. 

If you currently use Container Registry, use the information on this page to learn about transitioning to Artifact Registry.


*	Container Security
    *   Google Kubernetes Engine (GKE) provides many ways to help secure your workloads. Protecting workloads in GKE involves many layers of the stack, including the contents of your container image, the container runtime, the cluster network, and access to the cluster API server.
  * Authentication and authorization
Kubernetes supports two types of authentication:

User accounts are accounts that are known to Kubernetes, but are not managed by Kubernetes - for example, you cannot create or delete them using kubectl.
Service accounts are accounts that are created and managed by Kubernetes, but can only be used by Kubernetes-created entities, such as pods.
In a GKE cluster, Kubernetes user accounts are managed by Google Cloud, and may be one of the following two types:

Google Account
Google Cloud service account
Once authenticated, you need to authorize these identities to create, read, update or delete Kubernetes resources.

Despite the similar names, Kubernetes service accounts and Google Cloud service accounts are different entities. Kubernetes service accounts are part of the cluster in which they are defined and are typically used within that cluster. By contrast, Google Cloud service accounts are part of a Google Cloud project, and can easily be granted permissions both within clusters and to Google Cloud project clusters themselves, as well as to any Google Cloud resource using Identity and Access Management (IAM). This makes Google Cloud service accounts more powerful than Kubernetes service accounts; in order to follow the security principle of least privilege, you should consider using Google Cloud service accounts only when their capabilities are required.

To configure more granular access to Kubernetes resources at the cluster level or within Kubernetes namespaces, you use Role-Based Access Control (RBAC). RBAC allows you to create detailed policies that define which operations and resources you allow users and service accounts to access. With RBAC, you can control access for Google Accounts, Google Cloud service accounts, and Kubernetes service accounts. To further simplify and streamline your authentication and authorization strategy for GKE, you should ensure that the legacy Attribute Based Access Control is disabled so that Kubernetes RBAC and IAM are the sources of truth.


When you create a Google Cloud project, you are the only user on the project. By default, no other users have access to your project or its resources, including Google Kubernetes Engine resources. Google Kubernetes Engine supports multiple options for managing access to resources within your project and its clusters using role-based access control (RBAC).

*	Google Kubernetes Engine GKE
    *   Google Kubernetes Engine (GKE) provides a managed environment for deploying, managing, and scaling your containerized applications using Google infrastructure. The GKE environment consists of multiple machines (specifically, Compute Engine instances) grouped together to form a cluster.

    * GKE clusters are powered by the Kubernetes open source cluster management system. Kubernetes provides the mechanisms through which you interact with your cluster. You use Kubernetes commands and resources to deploy and manage your applications, perform administration tasks, set policies, and monitor the health of your deployed workloads.

    * Kubernetes draws on the same design principles that run popular Google services and provides the same benefits: automatic management, monitoring and liveness probes for application containers, automatic scaling, rolling updates, and more. When you run your applications on a cluster, you're using technology based on Google's 10+ years of experience running production workloads in containers.


*   Kubernetes on Google Cloud
    * When you run a GKE cluster, you also gain the benefit of advanced cluster management features that Google Cloud provides. These include:

    * Google Cloud's load-balancing for Compute Engine instances
Node pools to designate subsets of nodes within a cluster for additional flexibility
    * Automatic scaling of your cluster's node instance count
    * Automatic upgrades for your cluster's node software
    * Node auto-repair to maintain node health and availability
    * Logging and monitoring with Google Cloud's operations suite for visibility into your cluster


> Databases 
* Cloud SQL
Cloud SQL is a fully-managed database service that helps you set up, maintain, manage, and administer your relational databases on Google Cloud Platform.

You can use Cloud SQL with MySQL, PostgreSQL, or SQL Server.


> API Management
*	API Gateway general concepts  
  *   An API gateway is the core of an API management solution. It acts as the single entryway into a system allowing multiple APIs or microservices to act cohesively and provide a uniform experience to the user. The most important role the API gateway plays is ensuring reliable processing of every API call. In addition, the API gateway provides the ability to design API specs, help provide enterprise-grade security, and manage APIs centrally. 


## Excercise Deploy App With App Engine

1. Sign in to Cloud Console and create a new project or reuse an existing one. (If you don't already have a Gmail or Google Workspace account, you must create one.)

![Google Console](https://i.ibb.co/4W47v6W/google1.png)


2. Once you have clicked on the new project you will create the required project of your name as below 

![Create Project](https://i.ibb.co/rfc3K48/google2.png)


* Identifying your project details 

![Project Details ](https://i.ibb.co/cFLFrtT/google3.png)

>Note : Google Cloud can be operated from the cloud shell 

* Activate Cloud Shell


From the Cloud Console, click Activate Cloud Shell 
![](https://i.ibb.co/ZHV8H44/google4.png)

Once you click on the shell button you will get the shell for your application 
![Google Shell](https://i.ibb.co/94qty8B/google5.png)


Run the Following command to authorize the cloud shell To make call to the GCP APi 

![](https://i.ibb.co/n3ckR9Z/google6.png)

Run the auth Login 
![](https://i.ibb.co/Q8c4Ycd/google8.png)


Listing the project 
![Cloud](https://i.ibb.co/m5xspGb/google9.png)


* Updating your pom.xml

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" ...>
  ...
  <build>
    <plugins>
      <plugin>
        <groupId>com.google.cloud.tools</groupId>
        <artifactId>appengine-maven-plugin</artifactId>
        <version>2.2.0</version>
        <configuration>
          <version>1</version>
          <projectId>GCLOUD_CONFIG</projectId>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
~~~
** Add the above snippet with your project Id ** 

* Adding the App Engine Descriptor

~~~cmd 
mkdir -p src/main/appengine/
touch src/main/appengine/app.yaml
~~~
**Contents of the app.yaml**  
~~~yaml
runtime: java11  
instance_class: F1
~~~

#### **Different instance classes allow you to use different amounts of memory. F1 instance class is the smallest instance.**

* Deploy the app to App Engine
    First, initialize the project to be able to run App Engine apps. 

~~~cmd
gcloud app create --region us-central
You are creating an app for project [...].
WARNING: Creating an App Engine application for a project is irreversible and the region
cannot be changed. More information about regions is at
https://cloud.google.com/appengine/docs/locations
~~~

![AppEngin](https://i.ibb.co/GW2NfrX/google10.png)


Then Deploy your application using 
~~~cmd 
mvn -DskipTests package  appengine:deploy
~~~

![](https://i.ibb.co/ZV9XhLQ/google12.png)


Finally Run your 
~~~cmd
gcloud app browse
~~~
This willprint your cloud app url 



![](https://i.ibb.co/RYGFXRV/successcloud.png)


![Locating App](https://i.ibb.co/CwXCCN4/cloudlocation.png)
![AppSpot](https://i.ibb.co/bs7TdHc/appsopt.png)

Testing your deployed Application 


![Deployed App](https://i.ibb.co/1fMd7tp/appdeployed.png)

> ## <div style="color:red"> **Once you have tested delete your app project to avoid billing ** </div>





## Excercise Deploy App With Cloud Run

1. Sign in to Cloud Console and create a new project or reuse an existing one. (If you don't already have a Gmail or Google Workspace account, you must create one.)

![Google Console](https://i.ibb.co/4W47v6W/google1.png)


2. Once you have clicked on the new project you will create the required project of your name as below 

![Create Project](https://i.ibb.co/rfc3K48/google2.png)


* Identifying your project details 

![Project Details ](https://i.ibb.co/cFLFrtT/google3.png)

>Note : Google Cloud can be operated from the cloud shell 

* Activate Cloud Shell


From the Cloud Console, click Activate Cloud Shell 
![](https://i.ibb.co/ZHV8H44/google4.png)

Once you click on the shell button you will get the shell for your application 
![Google Shell](https://i.ibb.co/94qty8B/google5.png)


Run the Following command to authorize the cloud shell To make call to the GCP APi 

![](https://i.ibb.co/n3ckR9Z/google6.png)

Run the auth Login 
![](https://i.ibb.co/Q8c4Ycd/google8.png)


Listing the project 
![Cloud](https://i.ibb.co/m5xspGb/google9.png)


Writing a Sample Application

mkdir ~/helloworld-python
cd ~/helloworld-python

Using one of your preferred command line editors (nano, vim, or emacs) or the Cloud Shell web editor (click on the "Open Editor" pen-shaped icon), create a file named app.py and paste the following code into it:

app.py

~~~python
from flask import Flask, request

app = Flask(__name__)


@app.route("/", methods=["GET"])
def hello():
    """ Return a friendly HTTP greeting. """
    who = request.args.get("who", "World")
    return f"Hello {who}!\n"


if __name__ == "__main__":
    # Used when running locally only. When deploying to Cloud Run,
    # a webserver process such as Gunicorn will serve the app.
    app.run(host="localhost", port=8080, debug=True)

~~~

Containerize you application using DockerFile 
~~~dockerfile
# Use an official lightweight Python image.
# https://hub.docker.com/_/python
FROM python:3.9-slim

# Install production dependencies.
RUN pip install Flask gunicorn

# Copy local code to the container image.
WORKDIR /app
COPY . .

# Service must listen to $PORT environment variable.
# This default value facilitates local development.
ENV PORT 8080

# Run the web service on container startup. Here we use the gunicorn
# webserver, with one worker process and 8 threads.
# For environments with multiple CPU cores, increase the number of workers
# to be equal to the cores available.
CMD exec gunicorn --bind 0.0.0.0:$PORT --workers 1 --threads 8 --timeout 0 app:app
~~~

Define the PROJECT_ID and DOCKER_IMG environment variables which will be used throughout the next steps and make sure they have the correct values:

~~~shell
PROJECT_ID=$(gcloud config get-value project)
DOCKER_IMG="gcr.io/$PROJECT_ID/helloworld-python"

echo $PROJECT_ID
echo $DOCKER_IMG
~~~
Cloud Build is a service that executes your builds on GCP. It executes a series of build steps, where each build step is run in a Docker container to produce your application container (or other artifacts) and push it to Cloud Registry, all in one command.

~~~shell
gcloud builds submit --tag $DOCKER_IMG
~~~

Once pushed to the registry, you will see a SUCCESS message containing the image name. The image is stored in Container Registry and can be re-used if desired.

You can list all the container images associated with your current project using this command:

gcloud container images list


Finally Deploy to Cloud Run

~~~shell
gcloud run deploy helloworld-python \
  --image $DOCKER_IMG \
  --platform managed \
  --region $REGION \
  --allow-unauthenticated
~~~



~~~console
Deploying container to Cloud Run service [helloworld-python] in project [PROJECT_ID...
✓ Deploying new service... Done.                                   
  ✓ Creating Revision... Revision deployment finished. Waiting for health check...
  ✓ Routing traffic...
  ✓ Setting IAM Policy...
Done.
Service [helloworld-python] revision [helloworld-python-...] has been deployed
and is serving 100 percent of traffic.
Service URL: https://helloworld-python-....a.run.app
~~~


Cleanup if Done 
~~~
gcloud container images delete $DOCKER_IMG

~~~





## Excercise Create A Virtual Machine in GCP

1. Sign in to Cloud Console and create a new project or reuse an existing one. (If you don't already have a Gmail or Google Workspace account, you must create one.)

![Google Console](https://i.ibb.co/4W47v6W/google1.png)


2. Once you have clicked on the new project you will create the required project of your name as below 

![Create Project](https://i.ibb.co/rfc3K48/google2.png)


* Identifying your project details 

![Project Details ](https://i.ibb.co/cFLFrtT/google3.png)

>Note : Google Cloud can be operated from the cloud shell 

* Activate Cloud Shell


From the Cloud Console, click Activate Cloud Shell 
![](https://i.ibb.co/ZHV8H44/google4.png)

Once you click on the shell button you will get the shell for your application 
![Google Shell](https://i.ibb.co/94qty8B/google5.png)


Run the Following command to authorize the cloud shell To make call to the GCP APi 

![](https://i.ibb.co/n3ckR9Z/google6.png)

Run the auth Login 
![](https://i.ibb.co/Q8c4Ycd/google8.png)


Listing the project 
![Cloud](https://i.ibb.co/m5xspGb/google9.png)



~~~bash
gcloud compute instances create myinstance
Created [...].
NAME       ZONE           MACHINE_TYPE  PREEMPTIBLE INTERNAL_IP EXTERNAL_IP    STATUS
myinstance us-central1-f n1-standard-1             10.240.X.X  X.X.X.X        RUNNING
Note down the EXTERNAL_IP - that's important later on.
~~~


By default, Google Cloud Platform only allows few port accesses. Since we'll be installing Nginx soon - let's enable port 80 in the firewall configuration first.

~~~bash
$ gcloud compute firewall-rules create allow-80 --allow tcp:80
Created [...].
NAME      NETWORK  DIRECTION  PRIORITY  ALLOW   DENY  DISABLED
allow-80  default  INGRESS    1000      tcp:80        False
~~~

**SSH into the Instance**

~~~bash
gcloud compute ssh myinstance
Waiting for SSH key to propagate.
Warning: Permanently added 'compute.12345' (ECDSA) to the list of known hosts.
...
~~~



Installing a WebServer (Nginx)
~~~bash
# sudo su - 
# apt-get update
# apt-get install -y nginx
# service nginx start
# exit
~~~



~~~bash
wget -q -O - localhost:80 | grep nginx
<title>Welcome to nginx!</title>
<h1>Welcome to nginx!</h1>
<p>If you see this page, the nginx web server is successfully installed and
<a href="http://nginx.org/">nginx.org</a>.<br/>
<a href="http://nginx.com/">nginx.com</a>.</p>
<p><em>Thank you for using nginx.</em></p>
~~~



# Excercise Create A Cloud SQL DB and upload data

Steps : From your cloud console 
1. Go to the Cloud SQL Instances page.
2. Select your project and click Continue.
3. Click Create Instance.
4. Click MySQL.
5. If you're prompted to enable the Compute API, click the Enable API button.
6. Enable the Cloud SQL Admin API.
7. Enter myinstance for Instance ID.
9. Enter a password for the root user.
10. Use the default values for the other fields. Click Create.


In the Google Cloud Console, click the Cloud Shell icon (Cloud Shell icon) in the upper right corner.

When Cloud Shell finishes initializing, the following appears:

~~~code
gcloud sql connect myinstance --user=root
~~~
At the Cloud Shell prompt, connect to your Cloud SQL instance:

The mysql prompt appears.

* Create a SQL database on your Cloud SQL instance
~~~sql
CREATE DATABASE airports 
Use Database airports 

-- airports.airports definition
CREATE TABLE `airports` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `latitude` varchar(100) DEFAULT NULL,
  `longitude` varchar(100) DEFAULT NULL,
  `country_name` varchar(100) DEFAULT NULL,
  `region_name` varchar(100) DEFAULT NULL,
  `municipality` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1  DEFAULT CHARSET=utf8mb4;

-- airports.countries definition

CREATE TABLE `countries` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `continent` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1  DEFAULT CHARSET=utf8mb4;

-- airports.navaids definition

CREATE TABLE `navaids` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `latitude` varchar(100) DEFAULT NULL,
  `longitude` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1  DEFAULT CHARSET=utf8mb4;

-- airports.regions definition

CREATE TABLE `regions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `continent` varchar(100) DEFAULT NULL,
  `iso_country` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=332490 DEFAULT CHARSET=utf8mb4;
~~~
Insert and check the database for the records 
Sample Database scripts are available in the resource\dbscripts location 