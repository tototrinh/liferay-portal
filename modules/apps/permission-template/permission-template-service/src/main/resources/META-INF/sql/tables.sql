create table PermissionTemplateSetting (
	mvccVersion LONG default 0 not null,
	ctCollectionId LONG default 0 not null,
	permissionTemplateSettingId LONG not null,
	groupId LONG,
	companyId LONG,
	classNameId LONG,
	classPK LONG,
	permissionTemplateEnabled BOOLEAN,
	primary key (permissionTemplateSettingId, ctCollectionId)
);