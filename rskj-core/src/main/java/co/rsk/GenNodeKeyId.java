/*
 * This file is part of RskJ
 * Copyright (C) 2017 RSK Labs Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */


package co.rsk;

import org.ethereum.crypto.ECKey;
import org.spongycastle.util.encoders.Hex;

/**
 * Created by ajlopez on 3/9/2016.
 * Used by testnet generator, to generate each node private key and node id
 */
public class GenNodeKeyId {
    public static void main(String[] args) {
        ECKey key = new ECKey();
        String keybytes = Hex.toHexString(key.getPrivKeyBytes());
        String pubkeybytes = Hex.toHexString(key.getPubKey());
        String address = Hex.toHexString(key.getAddress());
        String nodeid = Hex.toHexString(key.getNodeId());

        System.out.println('{');
        System.out.println("   \"privateKey\": \"" + keybytes + "\",");
        System.out.println("   \"publicKey\": \"" + pubkeybytes + "\",");
        System.out.println("   \"address\": \"" + address + "\",");
        System.out.println("   \"nodeId\": \"" + nodeid + "\"");
        System.out.println('}');
    }
}
