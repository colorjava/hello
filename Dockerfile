FROM swr.cn-north-1.myhuaweicloud.com/huawei-cse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/hello-0.0.1-SNAPSHOT.jar .

ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
