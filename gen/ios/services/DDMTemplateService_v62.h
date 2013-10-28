@interface DDMTemplateService_v62 : NSObject

- (NSDictionary *)getTemplate:(NSNumber *)groupId classNameId:(NSNumber *)classNameId templateKey:(NSString *)templateKey includeGlobalTemplates:(BOOL)includeGlobalTemplates;
- (NSArray *)getTemplatesByClassPk:(NSNumber *)groupId classPK:(NSNumber *)classPK;
- (NSNumber *)getTemplatesByStructureClassNameIdCount:(NSNumber *)groupId structureClassNameId:(NSNumber *)structureClassNameId;
- (NSDictionary *)updateTemplate:(NSNumber *)templateId classPK:(NSNumber *)classPK nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallImageFile:(NSDictionary *)smallImageFile serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getTemplatesByStructureClassNameId:(NSNumber *)groupId structureClassNameId:(NSNumber *)structureClassNameId start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;
- (NSDictionary *)copyTemplate:(NSNumber *)templateId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)fetchTemplate:(NSNumber *)groupId classNameId:(NSNumber *)classNameId templateKey:(NSString *)templateKey;
- (NSArray *)copyTemplates:(NSNumber *)classNameId classPK:(NSNumber *)classPK newClassPK:(NSNumber *)newClassPK type:(NSString *)type serviceContext:(NSDictionary *)serviceContext;
- (void)deleteTemplate:(NSNumber *)templateId;
- (NSArray *)getTemplates:(NSNumber *)groupId classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK type:(NSString *)type mode:(NSString *)mode;
- (NSDictionary *)addTemplate:(NSNumber *)groupId classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK templateKey:(NSString *)templateKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallImageFile:(NSDictionary *)smallImageFile serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs keywords:(NSString *)keywords type:(NSString *)type mode:(NSString *)mode;
- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs name:(NSString *)name description:(NSString *)description type:(NSString *)type mode:(NSString *)mode language:(NSString *)language andOperator:(BOOL)andOperator start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;

@end