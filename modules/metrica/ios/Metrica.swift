

@objc(Metrica)
class Metrica: NSObject {

    @objc func activate(_ apiKey: String) {
      print("DD: \(apiKey)")
      NSLog("DD: %@", apiKey)
  }
    
    @objc func reportEvent(_ eventName: String, _ parama: [AnyHashable : Any]?) {
      print("DD: \(eventName)")
      NSLog("DD: %@", eventName)
  }
}
