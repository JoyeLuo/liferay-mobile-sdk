@interface LayoutRevisionService_v62 : NSObject

- (NSDictionary *)addLayoutRevision:(NSNumber *)userId layoutSetBranchId:(NSNumber *)layoutSetBranchId layoutBranchId:(NSNumber *)layoutBranchId parentLayoutRevisionId:(NSNumber *)parentLayoutRevisionId head:(BOOL)head plid:(NSNumber *)plid portletPreferencesPlid:(NSNumber *)portletPreferencesPlid privateLayout:(BOOL)privateLayout name:(NSString *)name title:(NSString *)title description:(NSString *)description keywords:(NSString *)keywords robots:(NSString *)robots typeSettings:(NSString *)typeSettings iconImage:(BOOL)iconImage iconImageId:(NSNumber *)iconImageId themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId wapThemeId:(NSString *)wapThemeId wapColorSchemeId:(NSString *)wapColorSchemeId css:(NSString *)css serviceContext:(NSDictionary *)serviceContext;

@end