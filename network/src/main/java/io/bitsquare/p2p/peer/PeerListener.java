package io.bitsquare.p2p.peer;

import io.bitsquare.p2p.Address;
import io.bitsquare.p2p.network.Connection;

public interface PeerListener {
    void onFirstPeerAdded(Peer peer);

    void onPeerAdded(Peer peer);

    void onPeerRemoved(Address address);

    // TODO remove
    void onConnectionAuthenticated(Connection connection);
}