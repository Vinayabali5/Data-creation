package uk.ac.reigate.domain.lookup

import uk.ac.reigate.domain.Address

class PostcodeLookup {
    
    String id
    
    String streetAddress
    
    String place
    
    PostcodeLookup() {}
    
    PostcodeLookup(String id, String streetAddress, String place) {
        this.id = id
        this.streetAddress = streetAddress
        this.place = place
    }
    
    
    String toString() {
        return "id: " + this.id + ", streetAddress: " + this.streetAddress + ", place:" + this.place
    }
}
