# bug-reproducer-vertx-eventbus
In each of the projects (listener1, listener2 and producer) run maven package to create the fat jar.\
Open three terminals each at listener1, listener2 and producer respectively\
Run  java -jar target/starter-1.0.0-SNAPSHOT-fat.jar -cluster in each of the terminals\
Open a browser on your machine and type http://localhost:8888/. \
You should see something like "Hello from Vert.x! :: vert.x-eventloop-thread-1" on the browser and "Received message: ping!" on each of the listeners and:\
"Received reply pong! from Certificate verticle", "Received reply pong! from Registration verticle" on the producer terminal. Issue - You should see only one.\

