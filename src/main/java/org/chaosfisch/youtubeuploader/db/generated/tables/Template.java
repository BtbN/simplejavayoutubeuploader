/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

/**
 * This class is generated by jOOQ
 */
package org.chaosfisch.youtubeuploader.db.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Template extends org.jooq.impl.TableImpl<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord> {

	private static final long serialVersionUID = 1952676988;

	/**
	 * The singleton instance of <code>PUBLIC.TEMPLATE</code>
	 */
	public static final org.chaosfisch.youtubeuploader.db.generated.tables.Template TEMPLATE = new org.chaosfisch.youtubeuploader.db.generated.tables.Template();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord> getRecordType() {
		return org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord.class;
	}

	/**
	 * The column <code>PUBLIC.TEMPLATE.ID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.CATEGORY</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.Category> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.CategoryConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.COMMENT</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.Comment> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.CommentConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.COMMENTVOTE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> COMMENTVOTE = createField("COMMENTVOTE", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.DEFAULTDIR</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.io.File> DEFAULTDIR = createField("DEFAULTDIR", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.FileConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.DESCRIPTION</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(10000), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.EMBED</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> EMBED = createField("EMBED", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.KEYWORDS</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> KEYWORDS = createField("KEYWORDS", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MOBILE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> MOBILE = createField("MOBILE", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.NAME</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.NUMBER</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Short> NUMBER = createField("NUMBER", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.RATE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> RATE = createField("RATE", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.VIDEORESPONSE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.Videoresponse> VIDEORESPONSE = createField("VIDEORESPONSE", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.VideoresponseConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.VISIBILITY</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.Visibility> VISIBILITY = createField("VISIBILITY", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.VisibilityConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.ACCOUNT_ID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Integer> ACCOUNT_ID = createField("ACCOUNT_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.ENDDIR</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.io.File> ENDDIR = createField("ENDDIR", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.FileConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.LICENSE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.License> LICENSE = createField("LICENSE", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.LicenseConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.TITLE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.THUMBNAIL</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> THUMBNAIL = createField("THUMBNAIL", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.FACEBOOK</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> FACEBOOK = createField("FACEBOOK", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.TWITTER</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> TWITTER = createField("TWITTER", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MESSAGE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MESSAGE = createField("MESSAGE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_INSTREAM_DEFAULTS</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> MONETIZE_INSTREAM_DEFAULTS = createField("MONETIZE_INSTREAM_DEFAULTS", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_CLAIM</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> MONETIZE_CLAIM = createField("MONETIZE_CLAIM", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_OVERLAY</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> MONETIZE_OVERLAY = createField("MONETIZE_OVERLAY", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_TRUEVIEW</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> MONETIZE_TRUEVIEW = createField("MONETIZE_TRUEVIEW", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_INSTREAM</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> MONETIZE_INSTREAM = createField("MONETIZE_INSTREAM", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_PRODUCT</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> MONETIZE_PRODUCT = createField("MONETIZE_PRODUCT", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_SYNDICATION</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.Syndication> MONETIZE_SYNDICATION = createField("MONETIZE_SYNDICATION", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.SyndicationConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_TITLE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_TITLE = createField("MONETIZE_TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_DESCRIPTION</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_DESCRIPTION = createField("MONETIZE_DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_ID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_ID = createField("MONETIZE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_NOTES</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_NOTES = createField("MONETIZE_NOTES", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_TMSID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_TMSID = createField("MONETIZE_TMSID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_ISAN</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_ISAN = createField("MONETIZE_ISAN", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_EIDR</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_EIDR = createField("MONETIZE_EIDR", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_TITLEEPISODE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_TITLEEPISODE = createField("MONETIZE_TITLEEPISODE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_SEASON_NB</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_SEASON_NB = createField("MONETIZE_SEASON_NB", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_EPISODE_NB</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.String> MONETIZE_EPISODE_NB = createField("MONETIZE_EPISODE_NB", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_CLAIMTYPE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.ClaimType> MONETIZE_CLAIMTYPE = createField("MONETIZE_CLAIMTYPE", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.ClaimTypeConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_CLAIMOPTION</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.ClaimOption> MONETIZE_CLAIMOPTION = createField("MONETIZE_CLAIMOPTION", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.ClaimOptionConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_ASSET</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, org.chaosfisch.youtubeuploader.db.data.Asset> MONETIZE_ASSET = createField("MONETIZE_ASSET", org.jooq.impl.SQLDataType.VARCHAR.length(255).asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.AssetConverter()), this);

	/**
	 * The column <code>PUBLIC.TEMPLATE.MONETIZE_PARTNER</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Boolean> MONETIZE_PARTNER = createField("MONETIZE_PARTNER", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * Create a <code>PUBLIC.TEMPLATE</code> table reference
	 */
	public Template() {
		super("TEMPLATE", org.chaosfisch.youtubeuploader.db.generated.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.TEMPLATE</code> table reference
	 */
	public Template(java.lang.String alias) {
		super(alias, org.chaosfisch.youtubeuploader.db.generated.Public.PUBLIC, org.chaosfisch.youtubeuploader.db.generated.tables.Template.TEMPLATE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, java.lang.Integer> getIdentity() {
		return org.chaosfisch.youtubeuploader.db.generated.Keys.IDENTITY_TEMPLATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord> getPrimaryKey() {
		return org.chaosfisch.youtubeuploader.db.generated.Keys.CONSTRAINT_D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord>>asList(org.chaosfisch.youtubeuploader.db.generated.Keys.CONSTRAINT_D);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.TemplateRecord, ?>>asList(org.chaosfisch.youtubeuploader.db.generated.Keys.CONSTRAINT_1C);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.chaosfisch.youtubeuploader.db.generated.tables.Template as(java.lang.String alias) {
		return new org.chaosfisch.youtubeuploader.db.generated.tables.Template(alias);
	}
}
