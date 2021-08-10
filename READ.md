

<h2>Kafka 학습공간</h2>

<h4>Docker로 Kafka 구축</h4>

카프카 클러스터와 주키퍼를 설치하기 위해 docker-compose 사용 

- docker-copose.yml 작성

- 실행 : docker-compose -f docker-compse.yml up -d
- 컨테이너(카프카) 접속 : docker exec -i -t local-kafka bash 

<h4>Kafka 메세지 전송하기</h4>

- kakfa install 

- topic 생성 : bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test_topic

- topic 확인 : bin/kafka-topics.sh --list --bootstrap-server localhost:9092

- producer 시작 :  kafka-console-producer.sh --broker-list localhost:9092 --topic test_topic

- consumer 시작 :  kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test_topic --from-beginning

- 메세지전송 확인 

  
