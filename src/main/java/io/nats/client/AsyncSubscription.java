package io.nats.client;

public interface AsyncSubscription extends Subscription {

	void start() throws Exception;

	void setMessageHandler(MessageHandler cb);

}
