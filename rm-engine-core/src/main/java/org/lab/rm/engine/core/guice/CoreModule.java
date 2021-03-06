package org.lab.rm.engine.core.guice;

import org.lab.rm.engine.core.Constants;
import org.lab.rm.engine.core.common.SettingsManager;
import org.lab.rm.engine.core.mongo.DatastoreProvider;
import org.mongodb.morphia.Datastore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class CoreModule extends AbstractModule {

	private static final Logger LOG = LoggerFactory.getLogger(CoreModule.class);

	@Override
	public void configure() {
		LOG.debug("Configuring module");
		SettingsManager settingsManager = new SettingsManager().load(Constants.CONFIG_PATH);
		bind(SettingsManager.class).toInstance(settingsManager);
		Names.bindProperties(binder(), settingsManager.getProperties(Constants.CONFIG_SECTION_GLOBAL));
		bind(Datastore.class).toProvider(DatastoreProvider.class);
	}
}
