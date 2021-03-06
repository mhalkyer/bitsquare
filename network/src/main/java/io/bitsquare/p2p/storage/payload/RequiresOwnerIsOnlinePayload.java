package io.bitsquare.p2p.storage.payload;

import io.bitsquare.common.wire.Payload;
import io.bitsquare.p2p.NodeAddress;

/**
 * Used for messages which require that the data owner is online.
 * <p>
 * This is used for the offers to avoid dead offers in case the offerer is in standby mode or the app has
 * terminated without sending the remove message (e.g. network connection lost or in case of a crash).
 */
public interface RequiresOwnerIsOnlinePayload extends Payload {
    /**
     * @return NodeAddress of the data owner
     */
    NodeAddress getOwnerNodeAddress();
}
