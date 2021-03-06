import org.codehaus.plexus.util.*;

String buildLog = FileUtils.fileRead(new File(basedir, 'build.log'));

assert buildLog.contains('Downloading phantomjs binary') : 'phantomjs binaries were not downloaded.';
assert !buildLog.contains('phantomjs.binary.path=null') && !buildLog.contains('"phantomjs.binary.path":"null"') : "phantomjs.binary property was not properly set"
assert buildLog.contains('Results: 1 specs, 0 failures') : 'jasmine specs failed to execute'
assert buildLog.contains('BUILD SUCCESS') : 'build was not successful'