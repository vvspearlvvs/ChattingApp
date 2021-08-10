from kafka import KafkaConsumer
from json import loads
import time

# topic, broker list
topic_name = "topic_test"
consumer = KafkaConsumer(
            topic_name,
            bootstrap_servers=['localhost:9092'],
            auto_offset_reset='earliest',
            enable_auto_commit=True,
            group_id='my-group',
            value_deserializer=lambda x: loads(x.decode('utf-8')),
            consumer_timeout_ms=1000
            )
# consumer list를 가져온다
start = time.time()
print("[begin] Topic: %s 으로 consumer가 메시지 받아옴" % (topic_name))
for message in consumer:
    print("Partition: %d, Offset: %d, Value: %s" % ( message.partition, message.offset,message.value ))
print("[end] 걸린시간 :", time.time() - start)
