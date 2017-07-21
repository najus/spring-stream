# Spring-cloud-stream
Spring cloud stream with Kafka consumer

# Get things together
- Kafka

Download Kafka from https://kafka.apache.org/downloads

tar -xzf kafka_2.11-0.11.0.0.tgz
cd kafka_2.11-0.11.0.0

Start zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

Start kafka server
bin/kafka-server-start.sh config/server.properties

Create a kafka topic
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

..Wait to send messages..

- Clone the project
git clone https://github.com/najus/spring-stream.git

# Clean/build

- gradle clean
- gradle assemble
- gradle build

# Run

- Run the main class
- Start zookeeper
- Now send messages through terminal
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
