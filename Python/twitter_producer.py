#pip3 install kafak-python
#pip3 install python-twitter
#pip3 install tweepy

from tweepy.streaming import StreamListener
from tweepy import OAuthHandler
from tweepy import Stream
from kafka import KafkaProducer
import json

access_token = ""
access_token_secret =  ""
api_key =  ""
api_secret =  ""

topic_name="twitter_topic"

class StdOutListener(StreamListener):
    def on_data(self, data):
        raw_data = json.loads(data)
        producer.send(topic_name, raw_data["text"].encode('utf-8'))
        return True
    def on_error(self, status):
        print (status)

producer = KafkaProducer(bootstrap_servers='localhost:9092')
stdout = StdOutListener()

auth = OAuthHandler(api_key, api_secret)
auth.set_access_token(access_token, access_token_secret)

stream = Stream(auth, stdout)
stream.filter(track=["김연경"])
