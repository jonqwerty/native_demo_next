#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(Metrica, NSObject)

RCT_EXTERN_METHOD(activate :(NSString *)apiKey)

RCT_EXTERN_METHOD(reportEvent
                  :(NSString *)eventNative
                  :(NSDictionary *)params)


+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

@end
